package ru.mishinyura.gson;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Класс Example реализует пример работы с JSON.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 15.06.2018
 */
public class Example {
    public static void main(String[] args) {
        Human man = new Human();
        man.setName("Yura");
        man.setAge(18);
        //Сериализация
        String json = new Gson().toJson(man);
        System.out.println(json);

        //Десериализация
        Human fromJSON = new Gson().fromJson(json, Human.class);
        System.out.println(fromJSON);

    }

    private static class Human {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("age")
        @Expose
        private int age;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Human{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}
