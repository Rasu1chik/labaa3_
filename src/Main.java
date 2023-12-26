import Classes.*;
import Enums.Conjunctions;
import Enums.Professions;
import Enums.Pronoun;


public class Main {
    public static void main(String[] args) {
        Vintik vintik = new Vintik("Винтик");
        Cave cave = new Cave("пещера");
        Moon moon = new Moon("Луна");
        Shpuntik shpuntik = new Shpuntik("Шпунтик");
        They they = new They("Они");
        Rocket rocket = new Rocket("ракета ");
        Tail tail = new Tail("хвост");
        Wheels wheels = new Wheels("колеса");
        Klepka klepka = new Klepka("Клепка");
        Project project = new Project("проект");
        Korotyshka korotyshka = new Korotyshka("Коротышка");
        Astronaut astronaut = new Astronaut("космонавт");

        System.out.println(shpuntik.getName() + Conjunctions.AND + vintik.getName() + they.getstar() + they.think() + Conjunctions.HOW + they.deliver( cave.getName(), rocket.getName()) + Conjunctions.AND + vintik.launch(moon.getName()) + "\n" +
                they.thoughtOf_it(they.getName()) + they.attach(rocket.getName(),tail.getName(), wheels.getName()) + Conjunctions.COMMA + Conjunctions.TO + rocket.beAble(true,rocket.getName()) + rocket.ride(moon.getName()) + "\n"+
                they.beAble(false, they.getName()) + they.think() + they.take(wheels.getName(), moon.getName()) + "\n" +
                Professions.ENGINEER + klepka.gotOut("из последних сил") + Conjunctions.COMMA + klepka.jump(moon.getName()) + "\n" +
                klepka.became(false) + klepka.create(project.getName()) + Conjunctions.COMMA + klepka.decide() + klepka.toKnow("выгоды","неудобсвта")  + korotyshka.receive(korotyshka.getName(), moon.getName()) + "\n" +
                klepka.came("к выводу") +  Conjunctions.WHAT + Professions.ASTRONAUT + astronaut.receive("выгоды "," неудобтсв") );



    }
}