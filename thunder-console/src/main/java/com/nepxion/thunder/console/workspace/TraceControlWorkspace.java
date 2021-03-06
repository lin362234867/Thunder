package com.nepxion.thunder.console.workspace;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.awt.BorderLayout;

import com.nepxion.thunder.console.workspace.common.Workspace;
import com.nepxion.thunder.console.workspace.topology.TraceTopology;

public class TraceControlWorkspace extends Workspace {
    private static final long serialVersionUID = 1L;

    public TraceControlWorkspace() {
        super();

        setLayout(new BorderLayout());
        add(createTraceTopology().createContainer(), BorderLayout.CENTER);
    }

    protected TraceTopology createTraceTopology() {
        return new TraceTopology();
    }
}