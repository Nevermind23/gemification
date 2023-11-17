package a81;

import g91.C32338u0;
import java.util.List;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p342j$.util.function.Consumer;

/* renamed from: a81.xa */
public final /* synthetic */ class C30837xa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f76846a;

    public /* synthetic */ C30837xa(List list) {
        this.f76846a = list;
    }

    public final void accept(Object obj) {
        C32338u0.m95370a(this.f76846a, (StatementSearchResult) ((SearchResultObject) obj));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
