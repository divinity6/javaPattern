package Strategy.impl;

import Strategy.types.SumStrategy;

public class GaussSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
        return ( N + 1 )*N/2;
    }
}
