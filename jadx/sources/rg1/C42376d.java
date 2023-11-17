package rg1;

import org.java_websocket.exceptions.InvalidFrameException;
import pg1.C42200c;

/* renamed from: rg1.d */
public abstract class C42376d extends C42379g {
    public C42376d(C42200c cVar) {
        super(cVar);
    }

    /* renamed from: h */
    public void mo97825h() {
        if (!mo97837e()) {
            throw new InvalidFrameException("Control frame can't have fin==false set");
        } else if (mo97833a()) {
            throw new InvalidFrameException("Control frame can't have rsv1==true set");
        } else if (mo97834b()) {
            throw new InvalidFrameException("Control frame can't have rsv2==true set");
        } else if (mo97836d()) {
            throw new InvalidFrameException("Control frame can't have rsv3==true set");
        }
    }
}
