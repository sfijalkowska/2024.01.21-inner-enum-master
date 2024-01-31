package pl.comarch.camp.it.typy.wyliczeniowe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    private int id;
    private String name;
    private String surname;
    //MEN
    //WOMAN
    //OTHER
    //private String sex;

    //M
    //W
    //O
    //private char sex;

    private Sex sex;

    public enum Sex {
        MEN,
        WOMAN,
        OTHER
    }
}
