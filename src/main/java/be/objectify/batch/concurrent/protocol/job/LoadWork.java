package be.objectify.batch.concurrent.protocol.job;

import java.io.Serializable;

/**
 * @author Steve Chaloner (steve@objectify.be)
 */
public class LoadWork implements Serializable
{

    private final long processed;

    public LoadWork(final long processed)
    {
        this.processed = processed;
    }

    public long getProcessed()
    {
        return processed;
    }
}
