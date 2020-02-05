package be.vbgn.gradle.reproducer.tasks;

import java.util.Map;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.MapProperty;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.InputFile;

public abstract class AbstractWarEnrichmentTask extends DefaultTask implements WarEnrichmentTask {

    /**
     * WAR file used as input (is not modified)
     */
    private RegularFileProperty inputWar = getProject().getObjects().fileProperty();

    @InputFile
    @Override
    public RegularFileProperty getInputWar() {
        return inputWar;
    }

}
