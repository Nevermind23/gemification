package rg1;

import org.java_websocket.exceptions.InvalidDataException;
import pg1.C42200c;
import ug1.C43104c;

/* renamed from: rg1.j */
public class C42383j extends C42377e {
    public C42383j() {
        super(C42200c.TEXT);
    }

    /* renamed from: h */
    public void mo97825h() {
        super.mo97825h();
        if (!C43104c.m123691b(mo97824f())) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
    }
}
