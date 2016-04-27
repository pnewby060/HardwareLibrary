/*
 * Copyright (C) 2013 - 2015 Alexander Martinz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package alexander.martinz.libs.hardware.drm;

import java.util.UUID;

/**
 * Created by amartinz on 27.04.16.
 */
public class WidevineDrmInfo extends BaseDrmInfo {
    @Override public UUID getUuid() {
        return UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
    }
}
