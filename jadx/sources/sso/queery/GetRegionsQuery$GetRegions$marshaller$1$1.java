package sso.queery;

import android.support.p013v4.media.session.C0125b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8135p;
import sso.queery.GetRegionsQuery;
import ue1.C43079p;

final class GetRegionsQuery$GetRegions$marshaller$1$1 extends C41537m implements C43079p {
    public static final GetRegionsQuery$GetRegions$marshaller$1$1 INSTANCE = new GetRegionsQuery$GetRegions$marshaller$1$1();

    GetRegionsQuery$GetRegions$marshaller$1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C0125b.m366a(obj2);
        invoke((List<GetRegionsQuery.Region>) (List) obj, (C8135p.C8136a) null);
        return C41238w.f97225a;
    }

    public final void invoke(List<GetRegionsQuery.Region> list, C8135p.C8136a aVar) {
        C41536l.m120489i(aVar, "listItemWriter");
        if (list != null) {
            for (GetRegionsQuery.Region region : list) {
                aVar.mo23324b(region != null ? region.marshaller() : null);
            }
        }
    }
}
