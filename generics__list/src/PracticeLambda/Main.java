package PracticeLambda;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       List<Computer> computer = new ArrayList<>();

       computer.add(new Computer("pc",2010,1000,25999,
                    new Processor("i5",4,3.4,Country.JAPAN),
                    new HardDrive("asus",Type.SSD, 128,Country.USA)));

       computer.add(new Computer("laptop",2009,256,18999,
                    new Processor("i3",4,3.4,Country.USA),
                    new HardDrive("asus",Type.HDD, 550,Country.CHINA)));

       computer.add(new Computer("pc",2008,500,30999,
                    new Processor("i7",4,3.4,Country.CHINA),
                    new HardDrive("asus",Type.SSD, 900,Country.USA)));

       computer.add(new Computer("laptop",2009,256,19999,
                    new Processor("i7",4,3.4,Country.CHINA),
                    new HardDrive("asus",Type.HDD, 500,Country.JAPAN)));

        computer.add(new Computer("laptop",2019,256,45099,
                    new Processor("i7",4,3.4,Country.CHINA),
                    new HardDrive("asus",Type.HDD, 1000,Country.JAPAN)));

        computer.add(new Computer("laptop",2019,256,49199,
                    new Processor("i7",4,3.4,Country.CHINA),
                    new HardDrive("asus",Type.SSD, 980,Country.JAPAN)));

        Stream <Computer> stream = computer.stream();
        List <Computer> filtered = stream
                .sorted((o1,o2) -> o1.getYear()-o2.getYear())
//        1. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
                .filter(o1 -> o1.getHardDrive().getHardDriveVolume() >= 500)
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків не Китай
                .filter(o1 ->o1.getYear() > 2010 && o1.getHardDrive().getCountryMamufacture() != Country.CHINA)
//        3. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
                .filter(o1 -> o1.getHardDrive().getHardDriveType() == Type.SSD &&
                              o1.getHardDrive().getHardDriveVolume() > 500 &&
                              o1.getProcessor().getProcessorType() == "i7")

                .collect(Collectors.toList());
        Stream <Computer> stream1 = computer.stream();

        Set<Computer> sortedByPrice = stream1
//        4. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною
                .sorted((o1, o2) -> o1.getPrice()-o2.getPrice())
                .filter( o1 ->  o1.getHardDrive().getHardDriveType() == Type.SSD &&
                                o1.getHardDrive().getHardDriveVolume() > 500 &&
                                o1.getProcessor().getProcessorType() == "i7")
                .collect(Collectors.toSet());

//        for (Computer computer1 : filtered) {
//            System.out.println(computer1);
//        }

        for (Computer computer1: sortedByPrice) {
            System.out.println(computer1);
        }



    }

//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною

    }
