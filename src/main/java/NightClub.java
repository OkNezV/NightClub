import data.DanceStyle;
import data.MusicStyle;
import data.Person;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class NightClub {


    /**
     * Метод, проверяющий танцует ли человек под текущую музыку
     * @param music - музыка
     */
    public static void danceFloorOrBar(MusicStyle music){

        Person [] people = Person.values();

        switch (music) {

            case RNB_MUSIC:
                for(Person person : people){
                    if(Person.getArrayAsList(person.getDancing()).contains(DanceStyle.RNB.getDance())
                            || Person.getArrayAsList(person.getDancing()).contains(DanceStyle.HIP_HOP.getDance())){
                        System.out.println(person.getName() + " идет на танцпол");
                    } else {
                        System.out.println(person.getName() + " идет в бар и пьет водку");
                    }
                }
                break;
            case ELECTRO_HOUSE:
                for(Person person : people){
                    if(Person.getArrayAsList(person.getDancing()).contains(DanceStyle.ELECTRO_DANCE.getDance())){
                        System.out.println(person.getName() + " идет на танцпол");
                    } else {
                        System.out.println(person.getName() + " идет в бар и пьет водку");
                    }
                }
                break;
            case POP_MUSIC:
                for(Person person : people){
                    if(Person.getArrayAsList(person.getDancing()).contains(DanceStyle.POP_MUSIC_DANCING.getDance())){
                        System.out.println(person.getName() + " идет на танцпол");
                    } else {
                        System.out.println(person.getName() + " идет в бар и пьет водку");
                    }
                }
                break;

            default:
                System.out.println("Неизвестная музыка. Все идут в бар и пьют водку");
                break;
        }
    }

    /**
     * Метод, который каждые 5 секунд меняет автоматически музыку
     * @param expectedTime - время в течении которого музыка будет играть.
     *                     Расчитывается по формуле: желаемое время / (5 сек * количество музыки)
     */
    public static void musicTime(int expectedTime) {

        //Получаем список всей музыки
        MusicStyle[] musicStyles = MusicStyle.values();

        for(int timer = 0; timer < expectedTime; timer++) {

            for (MusicStyle currentMusic : musicStyles) {

                try {
                    System.out.println("---\nТекущее время: " + LocalTime.now().getSecond()
                            + " секунд\nМузыка: " + currentMusic.getMusic());
                    danceFloorOrBar(currentMusic);
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * Основной метод
     * @param args
     */
    public static void main(String[] args) {

        musicTime(15); // 15 = 5 минут

    }
}