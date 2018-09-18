if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KtCore'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KtCore'.");
}
var KtCore = function (_, Kotlin) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  function Mob(uuid) {
    this.uuid = uuid;
  }
  Mob.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Mob',
    interfaces: []
  };
  var support_version;
  function Coords() {
  }
  Coords.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Coords',
    interfaces: []
  };
  function coordsOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_ftjx1y$_0 = closure$x;
    this.y_ftjx2t$_0 = closure$y;
    this.z_ftjx3o$_0 = closure$z;
  }
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_ftjx1y$_0;
    }
  });
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_ftjx2t$_0;
    }
  });
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_ftjx3o$_0;
    }
  });
  coordsOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Coords]
  };
  function coordsOf(x, y, z) {
    return new coordsOf$ObjectLiteral(x, y, z);
  }
  function mutableCoordsOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_7jwkvo$_0 = closure$x;
    this.y_7jwkut$_0 = closure$y;
    this.z_7jwkty$_0 = closure$z;
  }
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_7jwkvo$_0;
    },
    set: function (x) {
      this.x_7jwkvo$_0 = x;
    }
  });
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_7jwkut$_0;
    },
    set: function (y) {
      this.y_7jwkut$_0 = y;
    }
  });
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_7jwkty$_0;
    },
    set: function (z) {
      this.z_7jwkty$_0 = z;
    }
  });
  mutableCoordsOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Coords]
  };
  function mutableCoordsOf(x, y, z) {
    return new mutableCoordsOf$ObjectLiteral(x, y, z);
  }
  function Relative() {
  }
  Relative.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Relative',
    interfaces: [Coords]
  };
  function relativeOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_ydz0ec$_0 = closure$x;
    this.y_ydz0f7$_0 = closure$y;
    this.z_ydz0g2$_0 = closure$z;
  }
  Object.defineProperty(relativeOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_ydz0ec$_0;
    }
  });
  Object.defineProperty(relativeOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_ydz0f7$_0;
    }
  });
  Object.defineProperty(relativeOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_ydz0g2$_0;
    }
  });
  relativeOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Relative]
  };
  function relativeOf(x, y, z) {
    return new relativeOf$ObjectLiteral(x, y, z);
  }
  function mutableRelativeOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_hw5md6$_0 = closure$x;
    this.y_hw5me1$_0 = closure$y;
    this.z_hw5mew$_0 = closure$z;
  }
  Object.defineProperty(mutableRelativeOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_hw5md6$_0;
    },
    set: function (x) {
      this.x_hw5md6$_0 = x;
    }
  });
  Object.defineProperty(mutableRelativeOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_hw5me1$_0;
    },
    set: function (y) {
      this.y_hw5me1$_0 = y;
    }
  });
  Object.defineProperty(mutableRelativeOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_hw5mew$_0;
    },
    set: function (z) {
      this.z_hw5mew$_0 = z;
    }
  });
  mutableRelativeOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Relative]
  };
  function mutableRelativeOf(x, y, z) {
    return new mutableRelativeOf$ObjectLiteral(x, y, z);
  }
  function Vec() {
  }
  Vec.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Vec',
    interfaces: []
  };
  function vecOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_720u10$_0 = closure$x;
    this.y_720u05$_0 = closure$y;
    this.z_720tza$_0 = closure$z;
  }
  Object.defineProperty(vecOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_720u10$_0;
    }
  });
  Object.defineProperty(vecOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_720u05$_0;
    }
  });
  Object.defineProperty(vecOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_720tza$_0;
    }
  });
  vecOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Vec]
  };
  function vecOf(x, y, z) {
    return new vecOf$ObjectLiteral(x, y, z);
  }
  function mutableVecOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_mqvxja$_0 = closure$x;
    this.y_mqvxk5$_0 = closure$y;
    this.z_mqvxl0$_0 = closure$z;
  }
  Object.defineProperty(mutableVecOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_mqvxja$_0;
    },
    set: function (x) {
      this.x_mqvxja$_0 = x;
    }
  });
  Object.defineProperty(mutableVecOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_mqvxk5$_0;
    },
    set: function (y) {
      this.y_mqvxk5$_0 = y;
    }
  });
  Object.defineProperty(mutableVecOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_mqvxl0$_0;
    },
    set: function (z) {
      this.z_mqvxl0$_0 = z;
    }
  });
  mutableVecOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [Vec]
  };
  function mutableVecOf(x, y, z) {
    return new mutableVecOf$ObjectLiteral(x, y, z);
  }
  function Entitys() {
    Entitys$Companion_getInstance();
  }
  function Entitys$Companion() {
    Entitys$Companion_instance = this;
  }
  Entitys$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Entitys$Companion_instance = null;
  function Entitys$Companion_getInstance() {
    if (Entitys$Companion_instance === null) {
      new Entitys$Companion();
    }
    return Entitys$Companion_instance;
  }
  Entitys.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Entitys',
    interfaces: []
  };
  function Items() {
  }
  Items.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Items',
    interfaces: []
  };
  function Players() {
    Players$Companion_getInstance();
  }
  function Players$Companion() {
    Players$Companion_instance = this;
  }
  Players$Companion.prototype.getHealth = function () {
    return Entity.getHealth(Player.get());
  };
  Players$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Players$Companion_instance = null;
  function Players$Companion_getInstance() {
    if (Players$Companion_instance === null) {
      new Players$Companion();
    }
    return Players$Companion_instance;
  }
  Players.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Players',
    interfaces: []
  };
  var package$com = _.com || (_.com = {});
  var package$sorrowblue = package$com.sorrowblue || (package$com.sorrowblue = {});
  var package$ktcore = package$sorrowblue.ktcore || (package$sorrowblue.ktcore = {});
  var package$helper = package$ktcore.helper || (package$ktcore.helper = {});
  package$helper.Mob = Mob;
  Object.defineProperty(package$ktcore, 'support_version', {
    get: function () {
      return support_version;
    }
  });
  var package$peripheral = package$ktcore.peripheral || (package$ktcore.peripheral = {});
  var package$coord = package$peripheral.coord || (package$peripheral.coord = {});
  package$coord.Coords = Coords;
  package$coord.coordsOf_qt1dr2$ = coordsOf;
  package$coord.mutableCoordsOf_qt1dr2$ = mutableCoordsOf;
  package$coord.Relative = Relative;
  package$coord.relativeOf_qt1dr2$ = relativeOf;
  package$coord.mutableRelativeOf_qt1dr2$ = mutableRelativeOf;
  package$coord.Vec = Vec;
  package$coord.vecOf_yvo9jy$ = vecOf;
  package$coord.mutableVecOf_yvo9jy$ = mutableVecOf;
  Object.defineProperty(Entitys, 'Companion', {
    get: Entitys$Companion_getInstance
  });
  package$peripheral.Entitys = Entitys;
  package$peripheral.Items = Items;
  Object.defineProperty(Players, 'Companion', {
    get: Players$Companion_getInstance
  });
  package$peripheral.Players = Players;
  support_version = '1.1.2.42 beta';
  Kotlin.defineModule('KtCore', _);
  return _;
}(typeof KtCore === 'undefined' ? {} : KtCore, kotlin);

//# sourceMappingURL=KtCore.js.map
