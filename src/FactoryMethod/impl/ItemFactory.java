package FactoryMethod.impl;

import FactoryMethod.types.Factory;
import FactoryMethod.types.Item;

import java.util.HashMap;

public class ItemFactory extends Factory {

    private class ItemData {
        int maxCount;
        int currentCount;

        public ItemData( int maxCount ){
            this.maxCount = maxCount;
        }
    }

    private HashMap<String , ItemData> repository;

    public ItemFactory(){
        this.repository = new HashMap<String , ItemData>();

        this.repository.put( "sword" , new ItemData( 3 ) );
        this.repository.put( "shield" , new ItemData( 2 ) );
        this.repository.put( "bow" , new ItemData( 1 ) );
    }

    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = this.repository.get( name );

        if ( null == itemData ){
            System.out.println( name + "은 알 수 없는 아이템입니다." );
            return false;
        }

        if ( itemData.currentCount >= itemData.maxCount ){
            System.out.println( name + "은 품절 아이템입니다." );
            return false;
        }

        return true;
    }

    @Override
    public Item createItem(String name) {

        Item item = null;

        if ( "sword" == name ){
            item = new Sword();
        }

        if ( "shield" == name ){
            item = new Shield();
        }

        if ( "bow" == name ){
            item = new Bow();
        }

        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = this.repository.get( name );
        if ( null != itemData ){
            itemData.currentCount++;
        }
    }
}
