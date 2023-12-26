rs.status();
db.createUser({user: 'admin', pwd: 'admin', roles: [ { role: 'root', db: 'admin' } ]})

use admin;

db.createUser(
  {
    user: "dbmax",
    pwd: "ezdqc0JA",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
  }
);
