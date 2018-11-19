package org.bwen.playground.core;

public class BuilderPattern {
    private final int servingSize ;
    private final int servings;
    private final int calories ;
    private final int fat     ;
    private final int sodium   ;
    private final int carbonhydrate ;
    private BuilderPattern( Builder builder) {
            this.servingSize = builder.servingSize;
            this.servings = builder.servings;
            this.calories = builder.calories;
            this.fat = builder.fat;
            this.carbonhydrate = builder.carbonhydrate;
            this.sodium = builder.sodium;

    }
    public static class Builder {
        //required parameters
        private final int servingSize ;
        private final int servings;
        private int calories = 0;
        private int fat     = 0;
        private int sodium  = 0;
        private int carbonhydrate =0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val) {
            this.calories = val;
            return this;
        }
        public Builder fat(int val) {
            this.fat = val;
            return this;
        }
        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbonhydrate(int val) {
            this.carbonhydrate = val;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
