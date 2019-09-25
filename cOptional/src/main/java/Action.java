package main.java;

import java.util.Optional;

/**
 * Created by dingw on 7/24/2019.
 */

public class Action {
    public Action(){}

    private void testMap(Optional<String> opt){
        Optional<String> upperName = opt.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("No name found"));
    }

    private void testFlatMap(Optional<String> opt){
        Optional<String> upperName = opt.flatMap((value) -> Optional.of(value.toUpperCase()));
        System.out.println(upperName.orElse("No value found"));
    }

    private void testFilter(Optional<String> opt){
        Optional<String> longName = opt.filter((value) -> value.length() > 6);
        System.out.println(longName.orElse("The name is not longer than 6"));
    }

    public void vary(){
        //region null
        System.out.println("-- null");
        Optional<String> someNull;
        try {
            someNull = Optional.of(null);
        }
        catch(Exception e){
            System.out.println("Error: [" + e.getMessage() + "]");
        }
        //endregion

        Optional<String> name = Optional.of("Steve");
        Optional empty = Optional.ofNullable(null);

        //region ifPresent
        System.out.println("-- ifPresent");
        name.ifPresent((value) -> { System.out.println("value length " + value.length()); });
        //endregion

        //region orElse
        System.out.println("-- orElse");
        System.out.println(empty.orElse("no value present"));
        System.out.println(name.orElse("some value"));
        //endregion

        //region orElseGet
        System.out.println("-- orElseGet");
        System.out.println(empty.orElseGet(() -> "default value"));
        System.out.println(name.orElseGet(() -> "default value"));
        //endregion

        //region map
        System.out.println("-- map");
        testMap(name);
        testMap(empty);
        //endregion

        //region flatMap
        //input of flatMap must be of Optional
        System.out.println("-- flatMap");
        testFlatMap(name);
        testFlatMap(empty);
        //endregion

        //region filter
        System.out.println("-- filter");
        testFilter(Optional.of("Jeffrey"));
        testFilter(name);
        testFilter(empty);
        //endregion
    }
}
