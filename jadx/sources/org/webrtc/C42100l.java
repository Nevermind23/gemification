package org.webrtc;

import java.util.Arrays;
import java.util.List;
import org.webrtc.C42076d;
import org.webrtc.C42081f;
import xh1.C43294a0;

/* renamed from: org.webrtc.l */
public class C42100l implements VideoEncoderFactory {

    /* renamed from: e */
    private static final List f99022e = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});

    /* renamed from: a */
    private final C42081f.C42082a f99023a;

    /* renamed from: b */
    private final boolean f99024b;

    /* renamed from: c */
    private final boolean f99025c;

    /* renamed from: d */
    private final C43294a0 f99026d;

    public C42100l(C42076d.C42078b bVar, boolean z, boolean z2) {
        this(bVar, z, z2, (C43294a0) null);
    }

    public C42100l(C42076d.C42078b bVar, boolean z, boolean z2, C43294a0 a0Var) {
        if (bVar instanceof C42081f.C42082a) {
            this.f99023a = (C42081f.C42082a) bVar;
        } else {
            Logging.m122188g("HardwareVideoEncoderFactory", "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.f99023a = null;
        }
        this.f99024b = z;
        this.f99025c = z2;
        this.f99026d = a0Var;
    }
}
