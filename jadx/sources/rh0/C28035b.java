package rh0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.giftcards.data.model.BffExternalFileApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.BffExternalFileDetailApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.BffExternalFileExtensionApiModel;
import xh0.C29780a;
import xh0.C29781b;
import xh0.C29782c;
import xh0.C29783d;

/* renamed from: rh0.b */
public final class C28035b {
    /* renamed from: b */
    private final C29781b m86426b(BffExternalFileDetailApiModel bffExternalFileDetailApiModel) {
        int i;
        int i2;
        int i3;
        int i4;
        Boolean bool;
        String fileId = bffExternalFileDetailApiModel.getFileId();
        String fileUrl = bffExternalFileDetailApiModel.getFileUrl();
        Integer maxPixelX = bffExternalFileDetailApiModel.getMaxPixelX();
        boolean z = false;
        if (maxPixelX != null) {
            i = maxPixelX.intValue();
        } else {
            i = 0;
        }
        Integer maxPixelY = bffExternalFileDetailApiModel.getMaxPixelY();
        if (maxPixelY != null) {
            i2 = maxPixelY.intValue();
        } else {
            i2 = 0;
        }
        Integer minPixelX = bffExternalFileDetailApiModel.getMinPixelX();
        if (minPixelX != null) {
            i3 = minPixelX.intValue();
        } else {
            i3 = 0;
        }
        Integer minPixelY = bffExternalFileDetailApiModel.getMinPixelY();
        if (minPixelY != null) {
            i4 = minPixelY.intValue();
        } else {
            i4 = 0;
        }
        YesNoApiEntity isDark = bffExternalFileDetailApiModel.isDark();
        if (isDark != null) {
            if (isDark == YesNoApiEntity.YES) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return new C29781b(fileId, fileUrl, i, i2, i3, i4, bool, bffExternalFileDetailApiModel.getOrderNo());
    }

    /* renamed from: c */
    private final C29782c m86427c(BffExternalFileExtensionApiModel bffExternalFileExtensionApiModel) {
        List list;
        List<BffExternalFileDetailApiModel> details = bffExternalFileExtensionApiModel.getDetails();
        C29783d dVar = null;
        if (details != null) {
            list = new ArrayList(C41343r.m119925u(details, 10));
            for (BffExternalFileDetailApiModel b : details) {
                list.add(m86426b(b));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        String type = bffExternalFileExtensionApiModel.getType();
        if (type != null) {
            dVar = C29783d.f75335b.mo69962a(type);
        }
        return new C29782c(list, dVar);
    }

    /* renamed from: a */
    public final C29780a mo67574a(BffExternalFileApiModel bffExternalFileApiModel) {
        long j;
        String str;
        String str2;
        Boolean bool;
        ArrayList arrayList;
        Boolean bool2;
        boolean z;
        boolean z2;
        C41536l.m120489i(bffExternalFileApiModel, "apiModel");
        Long id = bffExternalFileApiModel.getId();
        if (id != null) {
            j = id.longValue();
        } else {
            j = -1;
        }
        long j2 = j;
        String fileId = bffExternalFileApiModel.getFileId();
        if (fileId == null) {
            str = "";
        } else {
            str = fileId;
        }
        String fileUrl = bffExternalFileApiModel.getFileUrl();
        if (fileUrl == null) {
            str2 = "";
        } else {
            str2 = fileUrl;
        }
        String channelCode = bffExternalFileApiModel.getChannelCode();
        String customerType = bffExternalFileApiModel.getCustomerType();
        YesNoApiEntity darkMode = bffExternalFileApiModel.getDarkMode();
        if (darkMode != null) {
            if (darkMode == YesNoApiEntity.YES) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        String directory = bffExternalFileApiModel.getDirectory();
        List<BffExternalFileExtensionApiModel> extensions = bffExternalFileApiModel.getExtensions();
        if (extensions != null) {
            arrayList = new ArrayList(C41343r.m119925u(extensions, 10));
            for (BffExternalFileExtensionApiModel c : extensions) {
                arrayList.add(m86427c(c));
            }
        } else {
            arrayList = null;
        }
        String fileSubtype = bffExternalFileApiModel.getFileSubtype();
        String fileType = bffExternalFileApiModel.getFileType();
        YesNoApiEntity isDark = bffExternalFileApiModel.isDark();
        if (isDark != null) {
            if (isDark == YesNoApiEntity.YES) {
                z = true;
            } else {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        } else {
            bool2 = null;
        }
        return new C29780a(j2, str, str2, channelCode, customerType, bool, directory, arrayList, fileSubtype, fileType, bool2, bffExternalFileApiModel.getLangCode(), bffExternalFileApiModel.getOrderNo(), bffExternalFileApiModel.getStatus());
    }

    /* renamed from: d */
    public final List mo67575d(List list) {
        C41536l.m120489i(list, "apiModels");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67574a((BffExternalFileApiModel) it.next()));
        }
        return arrayList;
    }
}
