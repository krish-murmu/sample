package org.krish.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter @ToString
public class Employee {

    private Long id;
    private String name;
    private String email;
    private int phoneno;
    
}
