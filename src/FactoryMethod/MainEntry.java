package FactoryMethod;

import FactoryMethod.impl.ItemFactory;
import FactoryMethod.types.Factory;
import FactoryMethod.types.Item;

public class MainEntry {

    public static void main( String[] args ){
        Factory factory = new ItemFactory();

        Item item1 = factory.create( "sword" );
        if ( null != item1 ){
            item1.use();
        }

        Item item2 = factory.create( "sword" );
        if ( null != item2 ){
            item2.use();
        }

        Item item3 = factory.create( "sword" );
        if ( null != item3 ){
            item3.use();
        }

        Item item4 = factory.create( "sword" );
        if ( null != item4 ){
            item4.use();
        }

        Item item5 = factory.create( "sword" );
        if ( null != item5 ){
            item5.use();
        }

        factory.create( "shield" );
        factory.create( "shield" );
        factory.create( "shield" );
        factory.create( "shield" );

        factory.create( "bow" );
        factory.create( "bow" );
        factory.create( "bow" );
    }
}
