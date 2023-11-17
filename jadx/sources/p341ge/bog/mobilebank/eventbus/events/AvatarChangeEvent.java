package p341ge.bog.mobilebank.eventbus.events;

import java.io.File;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.AvatarChangeEvent */
public class AvatarChangeEvent extends RootEvent {
    private File file;

    public File getFile() {
        return this.file;
    }

    public void setFile(File file2) {
        this.file = file2;
    }
}
