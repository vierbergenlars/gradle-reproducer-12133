package be.vbgn.gradle.reproducer.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.TaskAction;

public class InstallAmpsInWarTask extends AbstractInjectFilesInWarTask {

    @TaskAction
    public void injectFiles() {
        if (getSourceFiles().isEmpty()) {
            throw new GradleException();
        }
    }
}
