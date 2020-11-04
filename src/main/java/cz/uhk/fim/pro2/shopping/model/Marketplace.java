package cz.uhk.fim.pro2.shopping.model;

import cz.uhk.fim.pro2.shopping.utils.DataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Marketplace {
    private List<Child> offerList;

    public Marketplace() {
        this.offerList = new ArrayList<>();
        String[] boyNames = { "Charles", "John", "Henry", "Adolf"};
        String[] girlNames = { "Jane", "Helen", "Kate", "Eva"};
        String[] nationalitaies = { "Czech", "American", "Afroamerican", "German"};

        Random random = new Random();

        for (String name : boyNames) {
            this.offerList.add(new Child(
                    String.valueOf(Math.abs(name.hashCode())),
                    name,
                    random.nextDouble() * 15000,
                    DataGenerator.randomBirthdate(),
                    GenderType.MALE,
                    random.nextBoolean(),
                    random.nextDouble() * 100,
                    random.nextBoolean(),
                    nationalitaies[random.nextInt(4)],
                    0x88aef9,
                    0xaa3d98,
                    0x55fe13
            ));
        }

        for (String name : girlNames) {
            this.offerList.add(new Child(
                    String.valueOf(Math.abs(name.hashCode())),
                    name,
                    random.nextDouble() * 10000,
                    DataGenerator.randomBirthdate(),
                    GenderType.FEMALE,
                    random.nextBoolean(),
                    random.nextDouble() * 100,
                    random.nextBoolean(),
                    nationalitaies[random.nextInt(4)],
                    0xaa3d98,
                    0x55fe13,
                    0x88aef9
            ));
        }

        for (Child child : this.offerList) {
            System.out.println(child);
        }

        int minAge = 0;
        int maxAge = 14;
        double minPrice = 0;
        double maxPrice = 2000;
        GenderType gender = GenderType.MALE;

        filter(minAge, maxAge, minPrice, maxPrice, gender);

    }

    /**
     * Metoda pro filtrovani zbozi dle parametru
     * @param minPrice minimalni cena
     * @param maxPrice maximalni cena
     * @param minAge minimalni vek
     * @param maxAge maximalni vek
     * @param gender pohlavi
     */
    public void filter(int minAge, int maxAge, double minPrice, double maxPrice, GenderType gender) {
        List<Child> filteredList = this.offerList
                .stream()
                .filter(child ->
                        child.getAge() >= minAge &&
                        child.getAge() <= maxAge &&
                        child.getPrice() >= minPrice &&
                        child.getPrice() <= maxPrice &&
                        child.getGender().equals(gender)
                )
                .collect(Collectors.toList());

        System.out.println("=======");
        for (Child c : filteredList) {
            System.out.println(c);
        }
        System.out.println("=======");
    }

    /**
     * Metoda odebere nabidku z listu po pridani do kosiku podle indexu
     * @param index index nabidky
     */
    public void removeOffer(int index) {
        // TODO odebrani prvku z listu dle indexu
    }

    /**
     * Metoda odebere nabidku z listu po pridani do kosiku podle reference
     * @param child reference na konkretni nabidku
     */
    public void removeOffer(Child child) {
        // TODO odebrani prvku z listu dle reference
    }

    /**
     * Metoda pro vraceni konkretni nabidky
     * @param index index v listu
     * @return nabidka/dite
     */
    public Child getOfferDetail(int index) {
        // TODO vraceni vybrane nabidky podle indexu
        return null;
    }

    public List<Child> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Child> offerList) {
        this.offerList = offerList;
    }
}
