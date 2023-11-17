package wf1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wf1.a */
public enum C43194a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: e */
    public static final C43195a f100752e = null;

    /* renamed from: d */
    private final int f100768d;

    /* renamed from: wf1.a$a */
    public static final class C43195a {
        private C43195a() {
        }

        public /* synthetic */ C43195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43194a mo101746a(int i) {
            for (C43194a aVar : C43194a.values()) {
                if (aVar.mo101745b() == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f100752e = new C43195a((DefaultConstructorMarker) null);
    }

    private C43194a(int i) {
        this.f100768d = i;
    }

    /* renamed from: b */
    public final int mo101745b() {
        return this.f100768d;
    }
}
