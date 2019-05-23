import java.util.Random;

public enum Sorts {
    Absorption,
    Mommification,
    Foudre,
    Téléportation,
    Métamorphose;

    public static Sorts random() {
        Sorts[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
