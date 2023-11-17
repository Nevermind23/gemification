package p342j$.util.function;

/* renamed from: j$.util.function.y */
public final /* synthetic */ class C9495y implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f26138a;

    /* renamed from: b */
    public final /* synthetic */ Function f26139b;

    /* renamed from: c */
    public final /* synthetic */ Function f26140c;

    public /* synthetic */ C9495y(Function function, Function function2, int i) {
        this.f26138a = i;
        this.f26139b = function;
        this.f26140c = function2;
    }

    /* renamed from: a */
    public final Function mo25463a(Function function) {
        switch (this.f26138a) {
            case 0:
                function.getClass();
                return new C9495y(this, function, 0);
            default:
                function.getClass();
                return new C9495y(this, function, 0);
        }
    }

    public final Object apply(Object obj) {
        int i = this.f26138a;
        Function function = this.f26140c;
        Function function2 = this.f26139b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    /* renamed from: b */
    public final Function mo25465b(Function function) {
        switch (this.f26138a) {
            case 0:
                function.getClass();
                return new C9495y(this, function, 1);
            default:
                function.getClass();
                return new C9495y(this, function, 1);
        }
    }
}
