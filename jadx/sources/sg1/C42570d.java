package sg1;

/* renamed from: sg1.d */
public class C42570d extends C42573g implements C42568b {

    /* renamed from: c */
    private String f100180c = "*";

    /* renamed from: d */
    public String mo98021d() {
        return this.f100180c;
    }

    /* renamed from: h */
    public void mo98022h(String str) {
        if (str != null) {
            this.f100180c = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
}
