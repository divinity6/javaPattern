package Facade;


import Facade.impl.Facade;

public class MainEntry {

    public static void main( String[] args ){

        Facade facade = new Facade();

        String name = "Dorosh"; // 조회할 이름

        facade.run( name );
    }
}
