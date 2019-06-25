import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatRad {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpaCat = new Cat (grandpaName);

        String grannyName = reader.readLine();
        Cat grannyCat = new Cat(grannyName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, grandpaCat);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grannyCat, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(grandpaCat);
        System.out.println(grannyCat);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat m;
        private Cat f;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat m, Cat f) {
            this.name = name;
            this.m = m;
            this.f = f;
        }

        @Override
        public String toString() {
            if (m == null) {
                if (f == null)
                    return "The cat's name is " + name + ", no mother" + ", no father";
                else
                    return "The cat's name is " + name + ", no mother, " + "father is " + f.name;
            }
            else
            {
                if (f == null)
                    return "The cat's name is " + name + ", mother is " + m.name + ", no father";
                else
                    return "The cat's name is " + name + ", mother is " + m.name + ", father is " + f.name;}
        }
    }
}
