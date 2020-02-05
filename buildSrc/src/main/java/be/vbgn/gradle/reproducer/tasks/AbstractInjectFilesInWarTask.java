package be.vbgn.gradle.reproducer.tasks;


import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.internal.AbstractTask;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.SkipWhenEmpty;

abstract class AbstractInjectFilesInWarTask extends AbstractTask implements WarEnrichmentTask {

    /**
     * Files to inject in the war
     */
    private final ConfigurableFileCollection sourceFiles = getProject().files();

    /**
     * WAR file used as input (is not modified)
     */
    private RegularFileProperty inputWar = getProject().getObjects().fileProperty();

    @InputFile
    @Override
    public RegularFileProperty getInputWar() {
        return inputWar;
    }

    @InputFiles
    @SkipWhenEmpty
    public ConfigurableFileCollection getSourceFiles() {
        return sourceFiles;
    }

    public void setSourceFiles(Object files) {
        sourceFiles.setFrom(files);
    }

}
