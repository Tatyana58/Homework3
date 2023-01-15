public class Main {
    public static void main(String[] args) {System.out.println("Домашняя работа № 1 - УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задание 1");
        //Задание 1
        //С помощью условного оператора напишите программу, которая выводит в консоль:
        //поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        //информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        byte age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием! ");
        }
        if (age <18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно еще немного подождать.");
        }

        System.out.println("");

        System.out.println("Задание 2");
        //Задание 2
        //Напишите программу, которая выводит в консоль сообщение о том, что:
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        byte ageBaby=26;
       if (ageBaby >= 7&&ageBaby < 18) {
               System.out.println("Ребенок ходит в школу. ");
           }
           if (ageBaby >= 18&&ageBaby < 24) {
                   System.out.println("Человек уже закончил школу и может отправляться в университет.");
               }
           if (ageBaby >= 24) {
               System.out.println("Человек окончил университет и ему пора искать первую работу.");
           }
        System.out.println("   ");

        System.out.println("Задание 3");
        //Задание 3
        //Вместимость одного вагона поезда составляет 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        //Напишите программу, которая выводит в консоль сообщение о том,
        // есть ли место в вагоне: сидячее или стоячее или вагон уже полностью забит.
        byte totalVanPlace=102;                                // всего мест
        byte sedentaryTotalVan=60;                                  //сидячие места в вагоне
        byte stendingTotalVan= (byte) (totalVanPlace-sedentaryTotalVan); // Стоячие места в вагоне
        byte numberStVan=42;                                    //занято стоячих мест
        byte numberSedVan=31;                                    // занято сидячих мест
        if (numberStVan>=stendingTotalVan&&numberSedVan>=sedentaryTotalVan) {
            System.out.println("В вагоне нет свободных мест.");
        }if (numberStVan<stendingTotalVan&&numberSedVan<sedentaryTotalVan) {
            System.out.println("В вагоне свободно: "+(sedentaryTotalVan-numberSedVan)+" сидячих мест, и "+(stendingTotalVan-numberStVan)+" стоячих мест.");
        }if (numberStVan<stendingTotalVan&&numberSedVan>=sedentaryTotalVan) {
                System.out.println("В вагоне свободно: " + (stendingTotalVan - numberStVan) + " стоячих мест и сидячих мест нет.");
        }if (numberSedVan<sedentaryTotalVan&&numberStVan>=stendingTotalVan) {
            System.out.println("В вагоне свободно: " + (sedentaryTotalVan-numberSedVan) + " сидячих мест и стоячих мест нет.");
        }
        System.out.println("   ");

        System.out.println("Домашняя работа № 2 - УСЛОВНЫЕ ОПЕРАТОРЫ IF... ELSE... ");
        System.out.println("Задание 4");
        //Домашнее задание - 2
        //Задание 1
        //С помощью условного оператора и конструкции else перепишите программу, которая выводит в консоль:
        //поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        //информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        byte age4 =10;
        if (age4 >= 18) {
            System.out.println("Поздравляю с совершеннолетием! ");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно еще немного подождать.");
        }
        System.out.println("   ");

        System.out.println("Задание 5");
        //Задание 2
        //С помощью условного оператора и конструкции else перепишите программу,
        //которая выводит в консоль сообщение о том, что:
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        byte ageBaby5=7;
        if (ageBaby5 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        } else {
            if ((ageBaby5 >= 18)&&(ageBaby5 < 24)) {
                System.out.println("Человек уже закончил школу и может отправляться в университет.");
            } else {
                if ((ageBaby5 >= 7)&&(ageBaby5 < 18)) {
                        System.out.println("Ребенок ходит в школу. ");
                    } else {
                    System.out.println("Ребенок еще мал, чтобы куда-нибудь ходить. ");
                           }
                    }
                }
        System.out.println("   ");


        System.out.println("Задание 6");
        //Задание 3
        //Вместимость одного вагона поезда составляет 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        //С помощью условного оператора и конструкции else перепишите программу,
        // которая выводит в консоль сообщение о том, есть ли место в вагоне:
        // сидячее или стоячее или вагон уже полностью забит.
        if (numberStVan>=stendingTotalVan&&numberSedVan>=sedentaryTotalVan) {
            System.out.println("В вагоне нет свободных мест.");
        }else if(numberStVan<stendingTotalVan&&numberSedVan<sedentaryTotalVan) {
            System.out.println("В вагоне свободно: " + (sedentaryTotalVan - numberSedVan) + " сидячих мест, и " + (stendingTotalVan - numberStVan) + " стоячих мест.");
        }else if (numberStVan<stendingTotalVan&&numberSedVan>=sedentaryTotalVan) {
            System.out.println("В вагоне свободно: " + (stendingTotalVan - numberStVan) + " стоячих мест и сидячих мест нет.");
        }if(numberSedVan<sedentaryTotalVan&&numberStVan>=stendingTotalVan) {
            System.out.println("В вагоне свободно: " + (sedentaryTotalVan-numberSedVan) + " сидячих мест и стоячих мест нет.");
        }
        System.out.println("   ");

        System.out.println("Домашнее задание №3 - УСЛОВНЫЕ ОПЕРАТОРЫ  '==' , '!=' , '&&' и '||' ");
        System.out.println("Задание 7");
        //Задание 1
        //Напишите программу, которая помогает определить
        // в какое учреждение нужно отправить человека в зависимости от его возраста:
        //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
        //Если человек от 7 до 18 лет, то ему нужно ходить в школу;
        //Если человеку больше 18 лет, но меньше 24, то его место в университете;
        //А если человеку больше 24, то ему пора ходить на работу
        //При выполнении каждого условия программа должна выводить в консоль сообщение в формате :
        // "Если возраст человека равен … , то ему нужно ходить … (в зависимости от возраста дописать нужное)"
        byte ageMen=26;
        if (ageMen>=2 && ageMen<=6){
            System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить в детский сад. ");
        }else {
            if (ageMen>=7&&ageMen<18){
                System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить в школу. ");
            }else {
                if (ageMen >= 18 && ageMen < 24) {
                    System.out.println("Если возраст человека равен " + ageMen + ", то он должен посещать университет. ");
                } else {
                    if (ageMen > 24) {
                        System.out.println("Если возраст человека равен " + ageMen + ", то он должен ходить на работу. ");
                    } else {
                        System.out.println("Если возраст человека равен " + ageMen + ", то он еще мал. ");
                    }
                }
            }
        }
        System.out.println("   ");

        System.out.println("Задание 8");
        //Задание 2
        //Как правило, на аттракционах действуют ограничения и для детей по возрасту:
        //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        //Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        // Если взрослого нет, то кататься нельзя.
        //Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение о том, можно ли ребенку кататься одному
        // или в сопровождении взрослого в зависимости от того, сколько ему лет.
        byte ageBabyAttraction=6;
        boolean men=false;
        if (ageBabyAttraction<5){
            System.out.println("Если возраст ребенка равен "+ageBabyAttraction+", то он НЕ может кататься на аттракционе.");
        }else {
            if (ageBabyAttraction>=14){
                    System.out.println("Если возраст ребенка равен "+ageBabyAttraction+", то он может кататься без сопровождении взрослого.");
                }else {
                    if ((ageBabyAttraction>=5&&ageBabyAttraction<14)&&men) {
                            System.out.println("Если возраст ребенка равен "+ageBabyAttraction+", то он может кататься в сопровождении взрослого. Есть взрослый человек.");
                        }
                        else {
                            System.out.println("Ребенок " + ageBabyAttraction + " лет, НЕ может кататься на аттракционе, нет взрослого. ");
                        }
                }
            }
        System.out.println("   ");

        System.out.println("Задание 9");
        //Задание 3
        //Даны три числа:
        //int one;
        //int two;
        //int free;
        //С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бОльшее и выводит результат в консоль.
        int one=1;
        int two=2;
        int free=3;
        if (one>two&&one>free){
            System.out.println("Самое большое число 'one'= "+one);
        }else {
            if (two>one&&two>free){
                System.out.println("Самое большое число 'two'= "+two);
            }else {
                System.out.println("Самое большое число 'free'= "+free);
            }
        }
        System.out.println("   ");
    }
}