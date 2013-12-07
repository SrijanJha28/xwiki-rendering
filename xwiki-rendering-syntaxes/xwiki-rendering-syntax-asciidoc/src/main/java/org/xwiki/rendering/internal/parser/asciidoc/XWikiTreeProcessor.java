/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.internal.parser.asciidoc;

import java.util.List;

import org.asciidoctor.extension.Treeprocessor;
import org.asciidoctor.internal.Block;
import org.asciidoctor.internal.DocumentRuby;

/**
 * @version $Id$
 * @since 5.4M1
 */
public class XWikiTreeProcessor extends Treeprocessor
{
    public XWikiTreeProcessor(DocumentRuby documentRuby)
    {
        super(documentRuby);
    }

    @Override
    public void process()
    {
        final List<Block> blocks = this.document.blocks();

        for (int i = 0; i < blocks.size(); i++) {
            final Block currentBlock = blocks.get(i);
            List<String> lines = currentBlock.lines();
            System.out.println(lines);
        }
    }
}
