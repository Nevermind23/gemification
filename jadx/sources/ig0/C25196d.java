package ig0;

import java.math.BigDecimal;
import p341ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView;

/* renamed from: ig0.d */
public abstract class C25196d {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final ThumbnailGroupTextView.C13551a m80258b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            return ThumbnailGroupTextView.C13551a.POSITIVE;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return ThumbnailGroupTextView.C13551a.NEGATIVE;
        }
        return ThumbnailGroupTextView.C13551a.NEUTRAL;
    }
}
