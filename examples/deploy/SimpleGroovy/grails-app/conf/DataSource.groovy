dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	username = "<user-name>"
	password = "<password>"
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "<jdbc-url>"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "<jdbc-url>"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "<jdbc-url>"
		}
	}
}