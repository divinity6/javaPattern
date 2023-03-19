package Strategy.impl;

import Strategy.types.SumStrategy;

public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
        int sum = N;

        for ( long i = 1; i < N; i++ ){
            sum += 1;
        }

        return sum;
    }
}
