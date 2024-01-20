package pers;
import enums.*;
import interfaces.*;
import abstrakt_class.*;
import technical.*;
import java.util.Objects;
public class karlson extends People implements FindsPepls{
    private String name="Карлсон";
    private Location locashen=Location.darkness;
    private int dexterity;
    private int probability;
    NoiseLevel boise=new NoiseLevel();
    public karlson(int dexterity,int probability){
        super("Карлсон",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    public void moving(movement Movement,Location locashen){
        this.locashen=locashen;
        switch (Movement) {
            case sneaking:
                System.out.println(this.name + " прокрался в "+ locashen);
                break;
            case sneaks:
                System.out.println(this.name +" пробрался на "+ locashen);
                break;
            case hiding:
                System.out.println(this.name +" стараясь не шуметь, прячясь за "+ locashen);
                break;
            case crawled:
                System.out.println(this.name +" залез в красивый старинный буфет и кое-как прикрыл за собой дверцу");
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    public void finds(things what){
        switch (what) {
            case tablecloths:
                System.out.println(this.name + " находит скатерти и салфетки");
                break;
        }
    }
}