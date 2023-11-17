package y51;

import a31.C30481a;
import f61.C31927a;
import f61.C31928b;
import f61.C31931c;
import f61.C31932d;
import f61.C31933e;
import f61.C31934f;
import g91.C32300e0;
import j31.C36726b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlDataEntity;
import p341ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity;
import p341ge.bog.mobilebank.stories.data.entity.StoryDetailsEntity;
import p341ge.bog.mobilebank.stories.data.entity.StoryGroupDetailsEntity;
import p341ge.bog.mobilebank.stories.data.entity.StoryGroupEntity;

/* renamed from: y51.a */
public final class C40023a {

    /* renamed from: a */
    private final C30481a f95024a;

    /* renamed from: y51.a$a */
    public /* synthetic */ class C40024a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f95025a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity[] r0 = p341ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity r1 = p341ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity r1 = p341ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity.URL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f95025a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y51.C40023a.C40024a.<clinit>():void");
        }
    }

    public C40023a(C30481a aVar) {
        C41536l.m120489i(aVar, "urlMapper");
        this.f95024a = aVar;
    }

    /* renamed from: a */
    public final C31927a mo93847a(StoryButtonTypeEntity storyButtonTypeEntity) {
        int i;
        if (storyButtonTypeEntity == null) {
            i = -1;
        } else {
            i = C40024a.f95025a[storyButtonTypeEntity.ordinal()];
        }
        if (i == -1) {
            return C31927a.NONE;
        }
        if (i == 1) {
            return C31927a.DEEP_LINK;
        }
        if (i == 2) {
            return C31927a.URL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final C31931c mo93848b(StoryDetailsEntity storyDetailsEntity) {
        C31928b bVar;
        C41536l.m120489i(storyDetailsEntity, "details");
        long id = storyDetailsEntity.getId();
        String contentTitleGe = storyDetailsEntity.getContentTitleGe();
        String contentTitleEn = storyDetailsEntity.getContentTitleEn();
        String contentDescriptionGe = storyDetailsEntity.getContentDescriptionGe();
        String contentDescriptionEn = storyDetailsEntity.getContentDescriptionEn();
        String contentLinkGe = storyDetailsEntity.getContentLinkGe();
        C31928b bVar2 = null;
        if (contentLinkGe != null) {
            bVar = mo93852f(contentLinkGe);
        } else {
            bVar = null;
        }
        String contentLinkEn = storyDetailsEntity.getContentLinkEn();
        if (contentLinkEn != null) {
            bVar2 = mo93852f(contentLinkEn);
        }
        C31928b bVar3 = bVar2;
        C31927a a = mo93847a(storyDetailsEntity.getButtonType());
        String buttonTextGe = storyDetailsEntity.getButtonTextGe();
        String buttonTextEn = storyDetailsEntity.getButtonTextEn();
        String eventCloseName = storyDetailsEntity.getEventCloseName();
        String eventButtonClickName = storyDetailsEntity.getEventButtonClickName();
        String eventViewName = storyDetailsEntity.getEventViewName();
        String geoFileObjectId = storyDetailsEntity.getGeoFileObjectId();
        String intFileObjectId = storyDetailsEntity.getIntFileObjectId();
        C31934f.C31935a aVar = C31934f.f78716b;
        String storyType = storyDetailsEntity.getStoryType();
        if (storyType == null) {
            storyType = "";
        }
        return new C31931c(id, contentTitleGe, contentTitleEn, contentDescriptionGe, contentDescriptionEn, bVar, bVar3, a, buttonTextGe, buttonTextEn, eventCloseName, eventButtonClickName, eventViewName, geoFileObjectId, intFileObjectId, false, aVar.mo72420a(storyType), 32768, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final C31932d mo93849c(StoryGroupEntity storyGroupEntity) {
        List list;
        C41536l.m120489i(storyGroupEntity, "storyGroup");
        C31933e d = mo93850d(storyGroupEntity.getStory());
        List<StoryDetailsEntity> details = storyGroupEntity.getDetails();
        if (details != null) {
            list = new ArrayList(C41343r.m119925u(details, 10));
            for (StoryDetailsEntity b : details) {
                list.add(mo93848b(b));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C31932d(d, list);
    }

    /* renamed from: d */
    public final C31933e mo93850d(StoryGroupDetailsEntity storyGroupDetailsEntity) {
        C41536l.m120489i(storyGroupDetailsEntity, "storyGroupDetails");
        long id = storyGroupDetailsEntity.getId();
        String coverTitleGe = storyGroupDetailsEntity.getCoverTitleGe();
        String coverTitleEn = storyGroupDetailsEntity.getCoverTitleEn();
        C31934f.C31935a aVar = C31934f.f78716b;
        String storyType = storyGroupDetailsEntity.getStoryType();
        if (storyType == null) {
            storyType = "";
        }
        return new C31933e(id, coverTitleGe, coverTitleEn, aVar.mo72420a(storyType), storyGroupDetailsEntity.getEventClickName(), storyGroupDetailsEntity.getStoryDuration(), storyGroupDetailsEntity.getGeoFileObjectId(), storyGroupDetailsEntity.getIntFileObjectId());
    }

    /* renamed from: e */
    public final List mo93851e(List list) {
        C41536l.m120489i(list, "stories");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo93849c((StoryGroupEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final C31928b mo93852f(String str) {
        C36726b b;
        C41536l.m120489i(str, "contentLinKText");
        UrlDataEntity a = this.f95024a.mo70815a(str);
        if (a != null && (b = this.f95024a.mo70816b(a)) != null) {
            return new C31928b.C31929a(b);
        }
        if (C32300e0.m95172l(str)) {
            return new C31928b.C31930b(str);
        }
        return null;
    }
}
