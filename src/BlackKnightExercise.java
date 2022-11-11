public class BlackKnightExercise {
    public static void main(String[] args) {

    }
    /*
    class "BlackKnight"
    fields==> arms, legs, head, alive, name
    actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
     knight is dead when no head, arms and legs
     strike - implements cutArm, cutLeg and cutHead until knight is dead
     */
    public abstract class BlackKnight{
        //initial values
        private String name;
        private int arms = 2;
        private int legs = 2;
        private int head = 1;
        private boolean alive = true;

        public abstract void cutOffArm();
        public abstract void cutOffLeg();
        public abstract void cutOffHead();
        public abstract void strike();

    }

}
