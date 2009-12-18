/*
 * $Id$
 *
 * Copyright (c) 2009 T-Systems International GmbH.
 * All rights reserved.
 * This software is the confidential and proprietary information
 * of T-Systems International GmbH.
 *
 */
package com.tsi.netbeans.modules.languages.velocity.parser;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

/**
 *
 * @author <a href="mailto:werner.jaeger@t-systems.com">Werner Jaeger</a>
 */
public class SyntaxErrorsHighlightingTaskFactory extends TaskFactory
{
   /**
    * Creates new {@code SyntaxErrorsHighlightingTaskFactory}.
    */
   public SyntaxErrorsHighlightingTaskFactory()
   {
   }

   @Override
   public Collection<? extends SchedulerTask> create(final Snapshot snapshot)
   {
      return(Collections.singleton(new SyntaxErrorsHighlightingTask()));
   }
}
