package Builder;

import Builder.impl.Car;
import Builder.impl.CarBuilder;

import java.util.Random;

public class MainEntry {

    public static void main( String[] args ){
        Car car1 = new Car( "V7" , true , "black" , true , false );

//        Car car2 = new CarBuilder()
//                .setAEB( false )
//                .setAirbag( false )
//                .setCameraSensor( true )
//                .setColor( "white" )
//                .setEngine( "V9" )
//                .build();

        CarBuilder builder = new CarBuilder()
                .setAEB( false )
                .setCameraSensor( true )
                .setColor( "white" )
                .setEngine( "V9" );

        Random random = new Random();
        Car car2 = builder
                .setAirbag( random.nextInt( 2 ) == 0 ) // 50% 확률로 에어백 장착 결정
                .build();

        System.out.println( car1 );
        System.out.println( car2 );

    }
}
