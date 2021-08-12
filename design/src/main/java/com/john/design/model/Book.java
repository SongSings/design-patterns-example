package com.john.design.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author songjun
 * @date 2021-08-10
 * @desc
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private Long id;

    public String name;

    private String writer;

    private String introduction;


    public void look(){
        System.out.println("i now look book");
    }

    public void look(String name){
        System.out.println("i now look book is " + name);
    }

    private void talk(String val){
        System.out.println("talk " + val);
    }
}
