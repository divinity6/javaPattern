package Bridge.types;

import Bridge.impl.Draft;

public interface Display {

    void title( Draft draft );

    void author( Draft draft );

    void content( Draft draft );
}
