package com.xushen.test;/**
 * @Author:Created by sh00974
 * @Date on 2018/7/18.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

/**
 *@author gaohailiang
 *@date created on 2018/7/18
 */
public class TestList {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).sort( (e1, e2) -> e1.compareTo( e2 ) );
        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
        HashMap map=new HashMap();
        Arrays.asList( "a", "b", "d" ).parallelStream().forEach(sss->{
            System.out.println("aa");
        });

    }
}
