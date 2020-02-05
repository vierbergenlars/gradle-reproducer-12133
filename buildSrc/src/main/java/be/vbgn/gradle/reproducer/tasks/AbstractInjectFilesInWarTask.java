package be.vbgn.gradle.reproducer.tasks;


import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.internal.AbstractTask;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.SkipWhenEmpty;

abstract class AbstractInjectFilesInWarTask extends AbstractTask {

    /**
     * Files to inject in the war
     */
    private final ConfigurableFileCollection sourceFiles = getProject().files();

    @InputFiles
    @SkipWhenEmpty
    public ConfigurableFileCollection getSourceFiles() {
        return sourceFiles;
    }

    public void setSourceFiles(Object files) {
        sourceFiles.setFrom(files);
    }

}
