/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package scouter.xtra.jdbc;

import java.sql.SQLException;

public class SLOW_SQL extends SQLException {

	public SLOW_SQL() {
	}

	public SLOW_SQL(String reason) {
		super(reason);
	}

	public SLOW_SQL(Throwable cause) {
		super(cause);
	}

	public SLOW_SQL(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public SLOW_SQL(String reason, Throwable cause) {
		super(reason, cause);
	}

	public SLOW_SQL(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
	}

	public SLOW_SQL(String reason, String sqlState, Throwable cause) {
		super(reason, sqlState, cause);
		// TODO Auto-generated constructor stub
	}

	public SLOW_SQL(String reason, String sqlState, int vendorCode, Throwable cause) {
		super(reason, sqlState, vendorCode, cause);
	}

}
