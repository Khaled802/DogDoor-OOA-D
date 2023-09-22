package Door;

public class Bark {
    private final String bark;

    public Bark(String bark) {
        this.bark = bark;
    }

    public boolean equals(Object obj) {
        if (! (obj instanceof Bark) ) return false;
        var bark2 = (Bark) obj;
        return bark2.bark.equals(this.bark);
    }

    public boolean equalsAny(Bark[] barks) {
        for (var bark : barks) {
            if (this.equals(bark))
                return true;
        }
        return false;
    }
}
