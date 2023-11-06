public class Robots implements Robot {
    private int ptVie;
    private final int canon;
    private final int shield;
    private final int freq;

    public Robots(int canon, int shield, int freq) {
        this.canon = canon;
        this.shield = shield;
        this.freq = freq;
    }


    @Override
    public int getCanon() {
        return 0;
    }

    @Override
    public int getShield() {
        return 0;
    }

    @Override
    public int getFreq() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int diffLife(int i) {
        return 0;
    }

    private static class RobotBuilder {
        private int ptVie;
        private int puissanceCanon = 1;
        private int puissanceBouclier = 1;
        private int frequenceTir = 100;

        public RobotBuilder(int ptVie, int puissanceCanon) {
            this.ptVie = ptVie;
            this.puissanceCanon = puissanceCanon;
        }

        public RobotBuilder puissanceCanon(int puissanceBouclier) {
            this.puissanceBouclier = puissanceBouclier;
            return this;
        }

        public RobotBuilder frequenceTir(int frequenceTir) {
            this.frequenceTir = frequenceTir;
            return this;
        }


    }
}
