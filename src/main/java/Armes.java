import java.util.Random;

public enum  Armes {
    Épée,
    Lance,
    Hâche,
    Dagues,
    Arc;

    public static Armes random() {
        Armes[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}

