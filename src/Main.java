import br.com.me.lab.dominio.Bootcamp;
import br.com.me.lab.dominio.Course;
import br.com.me.lab.dominio.Dev;
import br.com.me.lab.dominio.MentoringSession;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var course1 = new Course("Curso Java", "Descrição Java", 10);
        var course2 = new Course("Curso SQL", "Descrição SQL", 8);

        var mentoring = new MentoringSession("Mentoria Java", "Descrição", LocalDate.now());

        var bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Descrição Bootcamp Java");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentoring);

        var devRoger = new Dev("Roger");
        devRoger.bootcampEnroll(bootcamp);
        System.out.println(devRoger.getContentEnrolled());
        System.out.println(devRoger.getContentFinished());
        devRoger.proceed();
        System.out.println("-");
        System.out.println(devRoger.getContentEnrolled());
        System.out.println(devRoger.getContentFinished());
        System.out.println(devRoger.calculateTotalXP());
        devRoger.proceed();
        devRoger.proceed();
        System.out.println("-");
        System.out.println(devRoger.getContentEnrolled());
        System.out.println(devRoger.getContentFinished());
        System.out.println(devRoger.calculateTotalXP());

        System.out.println("======================================");

        var devLucas = new Dev("Lucas");
        devLucas.bootcampEnroll(bootcamp);
        System.out.println(devLucas.getContentEnrolled());
        System.out.println(devLucas.getContentFinished());
        devLucas.proceed();
        System.out.println("-");
        System.out.println(devLucas.getContentEnrolled());
        System.out.println(devLucas.getContentFinished());
        System.out.println(devLucas.calculateTotalXP());
        devLucas.proceed();
        System.out.println("-");
        System.out.println(devLucas.getContentEnrolled());
        System.out.println(devLucas.getContentFinished());
        System.out.println(devLucas.calculateTotalXP());
    }
}