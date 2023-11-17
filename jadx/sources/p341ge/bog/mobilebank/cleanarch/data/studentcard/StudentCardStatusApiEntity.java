package p341ge.bog.mobilebank.cleanarch.data.studentcard;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.studentcard.StudentCardStatusApiEntity */
public final class StudentCardStatusApiEntity {
    private final String ShowStudentCardBanner;

    public StudentCardStatusApiEntity(String str) {
        C41536l.m120489i(str, "ShowStudentCardBanner");
        this.ShowStudentCardBanner = str;
    }

    public static /* synthetic */ StudentCardStatusApiEntity copy$default(StudentCardStatusApiEntity studentCardStatusApiEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = studentCardStatusApiEntity.ShowStudentCardBanner;
        }
        return studentCardStatusApiEntity.copy(str);
    }

    public final String component1() {
        return this.ShowStudentCardBanner;
    }

    public final StudentCardStatusApiEntity copy(String str) {
        C41536l.m120489i(str, "ShowStudentCardBanner");
        return new StudentCardStatusApiEntity(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StudentCardStatusApiEntity) && C41536l.m120484d(this.ShowStudentCardBanner, ((StudentCardStatusApiEntity) obj).ShowStudentCardBanner);
    }

    public final String getShowStudentCardBanner() {
        return this.ShowStudentCardBanner;
    }

    public int hashCode() {
        return this.ShowStudentCardBanner.hashCode();
    }

    public String toString() {
        String str = this.ShowStudentCardBanner;
        return "StudentCardStatusApiEntity(ShowStudentCardBanner=" + str + ")";
    }
}
