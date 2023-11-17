package p172m9;

/* renamed from: m9.b */
public class C7143b implements C7145d {

    /* renamed from: a */
    private final int f21153a;

    public C7143b(int i) {
        this.f21153a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo21397a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f21153a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
